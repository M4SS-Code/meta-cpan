DESCRIPTION = "Simple API to the client side of various internet protocols"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"libnet"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENCE;md5=78a521e0cfbb5ff5c87b4af1e263b269"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHAY/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "a71f4db580e1a767d6936faa5baf38f1fa617824342da078b561283e86f8f4a2"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

DEPENDS += "io-perl-native"

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "exporter-perl"
RDEPENDS:${PN} += "io-perl"
RDEPENDS:${PN} += "socket-perl"
RDEPENDS:${PN} += "time-local-perl"
RDEPENDS:${PN} += "constant-perl"

BBCLASSEXTEND = "native"
