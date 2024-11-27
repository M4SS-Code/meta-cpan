DESCRIPTION = "Module for manipulations of tar archives"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Archive-Tar"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BINGOS/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "81633c87f737846183d35c0f4c9d402da947a846b4881b30cce6d9ebe3c89d19"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "io-compress-perl"
RDEPENDS:${PN} += "pathtools-perl"
RDEPENDS:${PN} += "io-zlib-perl"
RDEPENDS:${PN} += "test-harness-perl"
RDEPENDS:${PN} += "test-simple-perl"

do_install:append:class-native() {
    rm ${D}/${bindir}/ptargrep \
        ${D}/${bindir}/ptar \
        ${D}/${bindir}/ptardiff
}

BBCLASSEXTEND = "native"
