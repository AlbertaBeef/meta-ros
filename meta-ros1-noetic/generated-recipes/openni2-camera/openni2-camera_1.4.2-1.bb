# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Drivers for the Asus Xtion and Primesense Devices. For using a kinect   with ROS, try the <a href="http://wiki.ros.org/freenect_stack">freenect stack</a>"
AUTHOR = "Michael Ferguson <mferguson@fetchrobotics.com>"
ROS_AUTHOR = "Julius Kammerl <jkammerl@todo.todo>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "openni2_camera"
ROS_BPN = "openni2_camera"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenni2-dev} \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    message-generation \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenni2-dev} \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    message-runtime \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenni2-dev} \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    message-runtime \
    nodelet \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/openni2_camera-release/archive/release/noetic/openni2_camera/1.4.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/openni2_camera"
SRC_URI = "git://github.com/ros-gbp/openni2_camera-release;${ROS_BRANCH};protocol=https"
SRCREV = "242d4b3fae20e36edf0b2eb1706a54803abe64b7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}