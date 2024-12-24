DESCRIPTION = "Look up Perl documentation in Pod format."

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Pod-Perldoc"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MALLEN/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "cc41e605b8e13c40a8ee6504ff46347b5ba7fbd92203b3bb055422051befc64d"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "encode-perl"
RDEPENDS:${PN} += "pathtools-perl"
RDEPENDS:${PN} += "file-temp-perl"
RDEPENDS:${PN} += "io-perl"
RDEPENDS:${PN} += "podlators-perl"
RDEPENDS:${PN} += "pod-simple-perl"
RDEPENDS:${PN} += "test-simple-perl"
RDEPENDS:${PN} += "text-parsewords-perl"

BBCLASSEXTEND = "native"
