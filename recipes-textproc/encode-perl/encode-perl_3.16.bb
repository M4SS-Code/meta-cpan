require encode-perl-${PV}.inc

do_install:prepend() {
    # Remove TMPDIR from comments in generated files
    grep -REl "${RECIPE_SYSROOT_NATIVE}${bindir}/perl-native/perl.real .*/enc2xs" ${S} \
        | grep -E '\.(:?(:?ex)?h|c)$' \
        | xargs sed -i -e "s:${RECIPE_SYSROOT_NATIVE}${bindir}/perl-native/perl.real .*/enc2xs:${bindir}/perl enc2xs:g"
}
