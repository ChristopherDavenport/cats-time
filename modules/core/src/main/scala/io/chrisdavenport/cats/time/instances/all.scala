package io.chrisdavenport.cats.time.instances

trait all 
  extends duration 
  with instant
  with localdate
  with localdatetime
  with localtime
  with month
  with monthday
  with offsetdatetime
  with offsettime
  with period
  with year
  with yearmonth
  with zoneddatetime
  with zoneid
  with zoneoffset

object all extends all
