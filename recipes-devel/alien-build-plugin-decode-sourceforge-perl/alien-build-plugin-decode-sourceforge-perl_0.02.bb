DESCRIPTION = "Alien::Build plugin to handle SourceForge links"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Alien-Build-Plugin-Decode-SourceForge"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=6f69e7d1ca83a63566f7154dcdfa121c"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "ac3a5aac8f6f8afdf63844f8175b71797cafbf39ae9991383e43c11280d21572"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "alien-build-perl"
RDEPENDS:${PN} += "alien-build-plugin-decode-perl"
RDEPENDS:${PN} += "uri-perl"

BBCLASSEXTEND = "native"
