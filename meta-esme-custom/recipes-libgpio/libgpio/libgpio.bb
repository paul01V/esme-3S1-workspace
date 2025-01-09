SUMMARY = "Library for GPIO control"
LICENSE = "MIT"
SRC_URI = "git://path/to/libgpio/repository;branch=master"
S = "${WORKDIR}/git"

inherit cmake

DEPENDS += "pkgconfig"
