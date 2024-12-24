DESCRIPTION = "Convert POD data to formatted text"

SECTION = "libs"
LICENSE = "(GPL-1.0-or-later | Artistic-1.0) & FSFAP & MIT"

PACKAGE_NAME=	"podlators"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "\
    file://LICENSE;beginline=9;endline=18;md5=a2d60110a5ffe88b6e8085fa22dff442 \
    file://LICENSE;beginline=20;endline=32;md5=ac5793f96ab67fd3000f9bf9b90b30cc \
    file://LICENSE;beginline=34;endline=60;md5=6692aa5a7aa468b8cfe064c10c643b65 \
"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/R/RR/RRA/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "2992125eab7d2b1c5a2b15a26ad7955f7d989eba6c831abdcaf2000e86a91337"

SRC_URI = "${BASE_SRC_URI}-v${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-v${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "pod-simple-perl"

BBCLASSEXTEND = "native"
