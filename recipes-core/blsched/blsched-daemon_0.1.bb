SUMMARY = "big LITTLE task placement experiment daemon"
HOMEPAGE = "https://github.com/BayLibre/bLsched"
LICENSE =  "MIT"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI = "file://bLsched.service \
	   file://COPYING \
	   "

LIC_FILES_CHKSUM = "file://COPYING;md5=e68225338e85b637c4ac8520c617f735"

COMPATIBLE_MACHINE ="((h|m)3ulcb|salvator-x)"
PACKAGE_ARCH = "${MACHINE_ARCH}"

DAEMONARGS_r8a7795 = "-b 1 -b 2 -b 3 -b 4"
DAEMONARGS_r8a7796 = "-b 0 -b 1"

RDEPENDS_${PN} += " blsched"

inherit systemd

SYSTEMD_SERVICE_${PN} = "bLsched.service"

do_copy_license () {
	cp ${WORKDIR}/COPYING ${S}
}

addtask copy_license after do_unpack before do_populate_lic

do_install_append () {
	# Install the systemd init file
	install -d ${D}${systemd_unitdir}/system
	install -c -m 0644 ${WORKDIR}/bLsched.service ${D}${systemd_unitdir}/system

	sed -i -e 's,@SBINDIR@,${sbindir},g' \
		-e 's,@ARGS@,${DAEMONARGS},g' \
		${D}${systemd_unitdir}/system/*.service
}
