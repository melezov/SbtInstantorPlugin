package com.instantor.plugin
package lists

import sbt._

trait Publications {
  @deprecated("Use Instantor.Api instead", "0.3.53")
  def InstantorApi = Instantor.Api;

  object Instantor {
    val Api =  "com.instantor" % "instantor-api" % "0.4.3"
    val Commons = "com.instantor.commons" %% "instantorcommons" % "0.0.3"
  }

  object Sandbox {
    val NameCompare = "com.instantor.ip.sandbox" %% "ip-namecompare-core" % "0.1.4"
    val Search = "com.instantor.ip.sandbox" %% "ip-search-core" % "2.0.0"
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
