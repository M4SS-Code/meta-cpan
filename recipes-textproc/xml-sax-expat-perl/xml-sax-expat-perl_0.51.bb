DESCRIPTION = "SAX2 Driver for Expat (XML::Parser)"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"XML-SAX-Expat"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/B/BJ/BJOERN/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "4c016213d0ce7db2c494e30086b59917b302db8c292dcd21f39deebd9780c83f"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "xml-namespacesupport-perl"
RDEPENDS:${PN} += "xml-parser-perl"
RDEPENDS:${PN} += "xml-sax-perl"
RDEPENDS:${PN} += "xml-sax-base-perl"

BBCLASSEXTEND = "native"
