DESCRIPTION = "Libssh::Session is a perl interface to the libssh library. It \
supports the authentification on a SSH server, command execution and some \
sftp capabilities."

SECTION = "libs"
LICENSE = "Apache-2.0"

PACKAGE_NAME=	"Libssh-Session"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/Q/QG/QGARNIER/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "3522b42a85fa670696d57a5fb83d04136ef7a8156a3ea0afcc961444656d4bd6"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan

DEPENDS += "libssh"

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "exporter-perl"

# TODO
# RRECOMMENDS:${PN} += "extutils-pkgconfig-perl"
# RRECOMMENDS:${PN} += "xsloader-perl"

BBCLASSEXTEND = "native"
