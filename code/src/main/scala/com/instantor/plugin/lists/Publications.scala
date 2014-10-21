package com.instantor.plugin
package lists

import sbt._

trait Publications {
  object BspClientApi {
    val Model = "com.instantor.bsp" % "bspclientapi-model" % "0.2.0"
  }

  object ClientInfo {
    val JApi     = "com.instantor.clientinfo" %  "clientinfo-japi"     % "0.4.1"
    val Extended = "com.instantor.clientinfo" %% "clientinfo-extended" % "0.4.1"
  }

  object Consolidator {
    val Model = "com.instantor.bsp" % "bspdsapi-consolidator" % "0.5.0"
  }

  object Api {
    val Shared  = "com.instantor.bsp" % "bspdsapi-apishared" % "0.5.0"
  }

  object Transport {
    val Common = "com.instantor.bsp" % "bspdsapi-transportcommon" % "0.5.0"
  }

  object Instantor {
    val Api     = "com.instantor" % "instantor-api" % "0.4.3"

    val Commons = "com.instantor.commons" %% "instantorcommons" % "0.0.3"
  }

  object PropsLoader {
    val Api  = "com.instantor.props" % "propsloader-api"  % "0.3.18"
    val Core = "com.instantor.props" % "propsloader-core" % "0.3.18"
  }

  object Sandbox {
    val NameCompare = "com.instantor.ip.sandbox" %% "ip-namecompare-core" % "0.1.4"
    val Search      = "com.instantor.ip.sandbox" %% "ip-search-core"      % "2.0.0"
  }

  object TotaLog {
    val Interfaces = "com.instantor.totalog" % "totalog-interfaces" % "0.6.0"
    val Transport  = "com.instantor.totalog" % "totalog-transport"  % "0.6.0"
    val Search     = "com.instantor.totalog" % "totalog-search"     % "0.6.0"
  }
}
