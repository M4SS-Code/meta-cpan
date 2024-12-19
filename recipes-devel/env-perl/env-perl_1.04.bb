DESCRIPTION = "Perl module that imports environment variables as scalars or arrays"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Env"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=76c1cbf18db56b3340d91cb947943bd3"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/F/FL/FLORA/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "d94a3d412df246afdc31a2199cbd8ae915167a3f4684f7b7014ce1200251ebb0"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

BBCLASSEXTEND = "native"
