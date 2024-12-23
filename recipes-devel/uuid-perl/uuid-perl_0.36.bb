DESCRIPTION = "Universally Unique Identifier library for Perl"

SECTION = "libs"
LICENSE = "Artistic-2.0"

PACKAGE_NAME=	"UUID"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=adbd4fa2b84c25d5dd1cfb58841fcee7"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/J/JR/JRM/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "c182e9ad854981a90803ae25380d2197ca6f923519e1d524bc85205eaf49bf06"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan

DEPENDS += "devel-checklib-perl-native"
DEPENDS += "pathtools-perl-native"
DEPENDS += "file-temp-perl-native"
DEPENDS += "scalar-list-utils-perl-native"

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "exporter-perl"
RDEPENDS:${PN} += "time-hires-perl"

BBCLASSEXTEND = "native"
