package com.instantor.plugin
package lists

import sbt._

trait Publications {
  val InstantorApi = "com.instantor" % "instantor-api" % "0.4.1"

  object Commons {
    val common = "com.instantor.commons" %% "instantorcommons-common" % "0.0.4"
    val plugin = "com.instantor.commons" %% "instantorcommons-plugin" % "0.0.4"
  }

  object PropsLoader {
    val Api  = "com.instantor.props" % "propsloader-api"  % "0.3.18"
    val Core = "com.instantor.props" % "propsloader-core" % "0.3.18"
  }

  object TotaLog {
    val Interfaces = "com.instantor.totalog" % "totalog-interfaces" % "0.5.6"
    val Transport  = "com.instantor.totalog" % "totalog-transport"  % "0.5.6"
    val Search     = "com.instantor.totalog" % "totalog-search"     % "0.5.6"
  }

  object BspClientApi {
    val Model = "com.instantor.bsp" % "bspclientapi-model" % "0.2.0"
  }
}
