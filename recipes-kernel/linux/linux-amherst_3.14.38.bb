# Copyright (C) 2015-2016 Info2Go
# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Info2Go"
DESCRIPTION = "Linux Kernel provided and supported by Info2Go."

require linux-amherst.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "info2go-imx_3.14.38_6qp_ga"
LOCALVERSION = "-1.0.0_ga-amherst-"
SRCREV = "1d97759616c7f4ca79e8c2262da0bd97a0093c76"

SRC_URI += " \
    file://0001-ARM-8158-LLVMLinux-use-static-inline-in-ARM-ftrace.patch \
    file://0001-ARM-LLVMLinux-Change-extern-inline-to-static-inline.patch \
    file://0003-ARM-imx6sl-Disable-imx6sl-specific-code-when-imx6sl-.patch \
    file://0004-mmc-sdhci-esdhc-imx-Fixup-runtime-PM-conditions-duri.patch \
"

COMPATIBLE_MACHINE = "(amherst-quad)"
