DESCRIPTION = "Gather package and POD information from perl module files"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Module-Metadata"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENCE;md5=7bd2c632d49a3927f944d94004ec74d0"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "b599d8770a9a9fa0a8ae3cd0ed395a9cf71b4eb53aed82989a6bece33485a9cd"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "encode-perl"
RDEPENDS:${PN} += "pathtools-perl"
RDEPENDS:${PN} += "version-perl"

BBCLASSEXTEND = "native"
