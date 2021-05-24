# Copyright (c) 2021 LG Electronics, Inc.

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://0001-CMakeLists.txt-allow-to-set-PICOVOICE_ARCHITECTURE-d.patch"

# There are prebuilt libraries only for 3 architectures:
# picovoice-driver/0.0.4-1-r0/git$ ls extern/picovoice/lib/
# aarch64  armv7l  x86_64

# Restrict this recipe with COMPATIBLE_MACHINE and then just force
# ARCHITECTURE with EXTRA_OECMAKE

COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_x86-64 = "(.*)"
COMPATIBLE_MACHINE_aarch64 = "(.*)"
COMPATIBLE_MACHINE_armv7a = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', '(.*)', '(^$)', d)}"
COMPATIBLE_MACHINE_armv7ve = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', '(.*)', '(^$)', d)}"

PICOVOICE_ARCHITECTURE_x86-64 = "x86_64"
PICOVOICE_ARCHITECTURE_aarch64 = "aarch64"
PICOVOICE_ARCHITECTURE_armv7a = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', 'armv7l', 'not-available', d)}"
PICOVOICE_ARCHITECTURE_armv7ve = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', 'armv7l', 'not-available', d)}"

EXTRA_OECMAKE += "-DPICOVOICE_ARCHITECTURE=${PICOVOICE_ARCHITECTURE}"
