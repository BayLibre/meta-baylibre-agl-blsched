SUMMARY = "big LITTLE task placement experiment"
HOMEPAGE = "https://github.com/BayLibre/bLsched"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b0df75b2edb80ee98b732ee0514a265c"

SRC_URI = "git://github.com/baylibre/blsched.git"
SRCREV = "a5c39ffb15281b0620aded983817edad5d8fec0d"

S = "${WORKDIR}/git"

inherit autotools
