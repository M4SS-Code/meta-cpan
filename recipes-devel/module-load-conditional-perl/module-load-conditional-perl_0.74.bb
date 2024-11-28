DESCRIPTION = "Implements default import method for modules"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Module-Load-Conditional"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BINGOS/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "54c354a9393820f1ebc2a095da084ea0392dcbccb0cb38a187a71831cc60a730"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

DEPENDS += "test-simple-perl-native"

RDEPENDS:${PN} += "locale-maketext-simple-perl"
RDEPENDS:${PN} += "module-corelist-perl"
RDEPENDS:${PN} += "module-load-perl"
RDEPENDS:${PN} += "module-metadata-perl"
RDEPENDS:${PN} += "params-check-perl"
RDEPENDS:${PN} += "version-perl"

BBCLASSEXTEND = "native"
