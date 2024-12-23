DESCRIPTION = "Perl interface for curl_easy_* functions"

SECTION = "libs"
LICENSE = "MIT"

PACKAGE_NAME=	"Net-Curl"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=f488429812fd8b47534756c11bf7f001"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/S/SY/SYP/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "8ccbcf745792ce45c0726067262fec5bb19a21540c8a6e7741160553fbf5ff68"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan

DEPENDS += "curl"

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "exporter-perl"
RDEPENDS:${PN} += "curl"

BBCLASSEXTEND = "native"
