DESCRIPTION = "This module is an interface to libxml2, providing XML and HTML parsers with \
DOM, SAX and XMLReader interfaces, a large subset of DOM Layer 3 interface \
and a XML::XPath-like interface to XPath API of libxml2. The module is \
split into several packages which are not described in this section; unless \
stated otherwise, you only need to "use XML::LibXML;" in your programs."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-LibXML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHLOMIF/XML-LibXML-${PV}.tar.gz"

SRC_URI[md5sum] = "d2bad7f395716a6f57abde538d47008c"
SRC_URI[sha256sum] = "a29bf3f00ab9c9ee04218154e0afc8f799bf23674eb99c1a9ed4de1f4059a48d"
DEPENDS += "libxml2"
DEPENDS += "libxml-sax-perl-native"
DEPENDS += "zlib"
DEPENDS += "alien-build-perl-native"
DEPENDS += "alien-libxml2-perl-native"
RDEPENDS:${PN} += "libxml2"
RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "encode-perl"
RDEPENDS:${PN} += "exporter-perl"
RDEPENDS:${PN} += "io-perl"
RDEPENDS:${PN} += "scalar-list-utils-perl"
RDEPENDS:${PN} += "xml-namespacesupport-perl"
RDEPENDS:${PN} += "xml-sax-perl"
RDEPENDS:${PN} += "xml-sax-base-perl"
RDEPENDS:${PN} += "base-perl"
RDEPENDS:${PN} += "constant-perl"
RDEPENDS:${PN} += "parent-perl"

S = "${WORKDIR}/XML-LibXML-${PV}"

inherit cpan

do_configure:append:class-target () {
    sed -E -i "s#([a-Z0-9_/.-]+?)(/ExtUtils/typemap)(\$|[^a-Z0-9_/.-])#${RECIPE_SYSROOT_NATIVE}\1\2\3#" Makefile
}

BBCLASSEXTEND = "native"
