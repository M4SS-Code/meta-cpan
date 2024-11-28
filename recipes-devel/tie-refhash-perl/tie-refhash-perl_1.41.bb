DESCRIPTION = "Use references as hash keys"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Tie-RefHash"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENCE;md5=04e42eee269f2926591c4708782ca7c1"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "48143505b176665896ac4276167c2cabe94ddb59c59d81610444f1bd36843138"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "scalar-list-utils-perl"

BBCLASSEXTEND = "native"
