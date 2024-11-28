DESCRIPTION = "Mojolicious is a fresh take on Perl web development, based on \
years of experience developing the Catalyst framework, and utilizing the \
latest web standards and technologies. You can get started with your project \
quickly, with a framework that grows with your needs."

SECTION = "libs"
LICENSE = "Artistic-2.0"

PACKAGE_NAME=	"Mojolicious"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e25cec8106f18dc981c1f6a3609df057"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/S/SR/SRI/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "130a490d77d76139f734ce1b894d459bae03805fb1f3dfdd58fc44fe82af3cfd"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "io-socket-ip-perl"
RDEPENDS:${PN} += "scalar-list-utils-perl"

BBCLASSEXTEND = "native"
