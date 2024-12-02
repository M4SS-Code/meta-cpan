DESCRIPTION = "Alien::Build plugin to download from GitHub"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Alien-Build-Plugin-Download-GitHub"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a9228344d1d0ebe4c894b1a34ffc0ad5"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "60e17142cb943828f54cb6de3e3caeb551545b31a66135c987f58a9e3eb0073c"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "alien-build-perl"
RDEPENDS:${PN} += "json-pp-perl"
RDEPENDS:${PN} += "path-tiny-perl"
RDEPENDS:${PN} += "uri-perl"
RDEPENDS:${PN} += "yaml-perl"

BBCLASSEXTEND = "native"
