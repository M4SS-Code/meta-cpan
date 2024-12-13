DESCRIPTION = "Encoding and decoding of base64 strings"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"MIME-Base64"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=50a396df84ff0c8a6ec5a482ec18ae94"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/C/CA/CAPOEIRAB/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "77f73d6f7aeb8d33be08b0d8c2617f9b6c77fb7fc45422d507ca8bafe4246017"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan

RDEPENDS:${PN} += "exporter-perl"
RDEPENDS:${PN} += "xsloader-perl"

BBCLASSEXTEND = "native"
