#!/bin/sh

export TMPDIR=/mnt/.psplash

SN=$(cat /etc/reach-version  |grep "^meta-iet"|awk '{print $3}' | cut -c1-8)
