SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI_append = "file://wls_startup.sh"

#INITSCRIPT_PACKAGES = "${PN}-wls_startup ${PN}-wls_shutdown"

INITSCRIPT_NAME = "wls_startup.sh"
INITSCRIPT_PARAMS = "start 99 5 ."

#INITSCRIPT_NAME_${PN}-wls_shutdown = "wls_shutdown.sh"
#INITSCRIPT_PARAMS${PN}-wls_shutdown = "start 20 0 1 6 ."

inherit update-rc.d

S = "${WORKDIR}"

do_install_append() {
  install -d ${D}${sysconfdir}/init.d/
  install -c -m 755 ${WORKDIR}/${INITSCRIPT_NAME} ${D}${sysconfdir}/init.d/${INITSCRIPT_NAME}
}

RDEPENDS_${PN} += "bash"
