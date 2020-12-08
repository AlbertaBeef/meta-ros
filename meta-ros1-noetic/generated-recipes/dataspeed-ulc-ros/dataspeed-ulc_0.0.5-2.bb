# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "CAN interface to the Universal Lat/Lon Controller (ULC) firmware"
AUTHOR = "Micho Radovnikovich <mradovnikovich@dataspeedinc.com>"
ROS_AUTHOR = "Micho Radovnikovich <mradovnikovich@dataspeedinc.com>"
HOMEPAGE = "https://bitbucket.org/dataspeedinc/dataspeed_ulc_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "dataspeed_ulc_ros"
ROS_BPN = "dataspeed_ulc"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dataspeed-ulc-can \
    dataspeed-ulc-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/DataspeedInc-release/dataspeed_ulc_ros-release/archive/release/noetic/dataspeed_ulc/0.0.5-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/dataspeed_ulc"
SRC_URI = "git://github.com/DataspeedInc-release/dataspeed_ulc_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "e5c3045f32c5d8bc27a4ed2a659d53468ec8b859"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}