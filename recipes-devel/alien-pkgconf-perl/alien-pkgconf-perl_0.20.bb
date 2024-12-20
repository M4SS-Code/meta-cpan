DESCRIPTION = "Discover or download and install pkgconf + libpkgconf"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Alien-pkgconf"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e84676c25359e6ffb270d0aef64d6bad"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "93ac0adcaccfa5ca3151bc9a4a3cc5e9d0591696b6ee059a3311f1e1cb49410d"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan

DEPENDS += "archive-tar-perl-native"
DEPENDS += "http-tiny-perl-native"
DEPENDS += "io-socket-ssl-perl-native"
DEPENDS += "json-pp-perl-native"
DEPENDS += "net-ssleay-perl-native"

RDEPENDS:${PN} += "file-sharedir-perl"
RDEPENDS:${PN} += "pkgconfig"

BBCLASSEXTEND = "native"
