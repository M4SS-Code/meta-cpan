DESCRIPTION = "Create or remove directory trees"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"File-Path"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/J/JK/JKEENAN/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "980f0a17edb353df46e9cd7b357f9f5929cde0f80c45fd7a06cf7e0e8bd6addd"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "pathtools-perl"
RDEPENDS:${PN} += "exporter-perl"

BBCLASSEXTEND = "native"
