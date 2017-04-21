SUMMARY = "big LITTLE task placement experiment"
HOMEPAGE = "https://github.com/BayLibre/bLsched"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b0df75b2edb80ee98b732ee0514a265c"

SRC_URI = "git://github.com/baylibre/blsched.git"
SRCREV = "8364f78f35b1962a973cc38411286b5d5ec64a93"

S = "${WORKDIR}/git"

inherit autotools
