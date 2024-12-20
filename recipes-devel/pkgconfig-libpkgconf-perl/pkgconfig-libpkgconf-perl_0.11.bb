DESCRIPTION = "Interface to .pc file interface via libpkgconf"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"PkgConfig-LibPkgConf"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e84676c25359e6ffb270d0aef64d6bad"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "171fe15bc7cd38629b5d2c02722e81236e404062708f2aea7b583275c4e8aa22"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan

DEPENDS += "alien-pkgconf-perl-native"

BBCLASSEXTEND = "native"
