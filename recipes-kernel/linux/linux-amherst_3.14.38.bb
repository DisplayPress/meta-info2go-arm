# Copyright (C) 2015-2016 Info2Go
# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Info2Go"
DESCRIPTION = "Linux Kernel provided and supported by Info2Go."

require linux-amherst.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "info2go_3.14.38_6qp_ga"
LOCALVERSION = "-1.0.0_ga-amherst-"
SRCREV = "5120ffa92ea9b7b3fe71da2b961f39c1b203033d"

SRC_URI += " \
    file://0001-ARM-imx6q-drop-unnecessary-semicolon.patch \
    file://0002-ARM-clk-imx6q-fix-video-divider-for-rev-T0-1.0.patch \
    file://0003-ARM-imx6sl-Disable-imx6sl-specific-code-when-imx6sl-.patch \
    file://0004-mmc-sdhci-esdhc-imx-Fixup-runtime-PM-conditions-duri.patch \
    file://0005-Revert-net-fec-fix-the-warning-found-by-dma-debug.patch \
"

COMPATIBLE_MACHINE = "(amherst-quad)"
