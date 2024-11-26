DESCRIPTION = "Mojo::IOLoop::Signal is a Mojo::IOLoop based, non-blocking \
signal handler."

SECTION = "libs"
LICENSE = "Artistic-1.0"

PACKAGE_NAME=	"Mojo-IOLoop-Signal"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=46f4d381e213dfb32e0fbaf8f699f8fc"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/S/SK/SKAJI/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "b9256b631c5546de22133798e065aded012735fde2fc8bb273d5323d5321ba67"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan_build allarch

DEPENDS += "module-build-tiny-perl-native"

RDEPENDS:${PN} += "mojolicious-perl"

BBCLASSEXTEND = "native"
