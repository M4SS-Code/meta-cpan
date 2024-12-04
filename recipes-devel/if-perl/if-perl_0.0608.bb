DESCRIPTION = "Use a Perl module if a condition holds "

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"if"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd2f07f7edc303d5405c6e561f04ffb"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "37206e10919c4d99273020008a3581bf0947d364e859b8966521c3145b4b3700"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

BBCLASSEXTEND = "native"
