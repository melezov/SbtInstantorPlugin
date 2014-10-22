import sbt._
import Keys._

import com.instantor.plugin.InstantorPlugin.{ Sandbox => _Sandbox, _ }

trait Default {
  lazy val defaultSettings =
    Defaults.defaultSettings ++
    instantorSettings ++ Seq()
}

object Sandbox extends Build with Default {
  lazy val proj1 = Project(
    "Sandbox-Proj1"
  , file("Proj1")
  , settings = defaultSettings ++ Seq(
      libraryDependencies ++= Seq(
        androidSDK
      , akkaActor
      , akkaCluster
      , akkaRemote
      , akkaSlf4j
      , akkaTestKit
      , asyncHttpClient
      , bouncyCastlecPGP
      , bouncyCastleMail
      , bouncyCastleProvider
      , c3p0
      , commonsCodec
      , commonsCollections
      , commonsCollections4
      , commonsCsv
      , commonsIo
      , commonsLang
      , commonsLogging
      , configrity
      , cssSelectors
      , dispatchClassic
      , dispatchCore
      , doitCsv
      , doj
      , dslClientJava
      , dslServerAkka
      , dslServerClient
      , dslServerCore
      , dslServerInterfaces
      , dslServerUtil
      , etbImg
      , etbLift
      , etbUtil
      , iorc
      , itext
      , ivy
//      , jettyContainer
      , jodaConvert
      , jodaTime
      , jsch
      , jsonAssert
      , jsoup
      , junit
      , junitInterface
      , liftCommon
      , liftJson
      , liftUtil
      , liftWebkit
      , log4jOverSlf4j
      , logback
      , lrl
      , markWrap
      , mimeTypes
      , openCsv
      , pgscala
      , pgscalaLegacy
      , picoContainer
      , postgres
      , randata
      , rhino
      , scalaIoCore
      , scalaIoFile
      , scalaPasswordHash
      , scalaTest
      , scalaTime
      , scalaTransliteration
      , scalaUUID
      , scalaz
      , scalaz7
      , selenate
      , seleniumFirefox
      , seleniumServer
      , servlet
      , slf4jApi
      , sprayCaching
      , sprayCan
      , sprayRouting
      , spyMemcached
      , squeryl
      , tagSoup
      , templater
      , xmlUnit
      , xstream
      , zip4j
      ) ++ (CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, scalaMajor)) if scalaMajor >= 11 =>
          Seq(
            scalaXml
          , scalaLogging3
          )

        case _ =>
          Seq(
            scalaLogging2
          )
      })
    )
  )

  lazy val proj2 = Project(
    "Sandbox-Proj2"
  , file("Proj2")
  , settings = defaultSettings ++ Seq(
      libraryDependencies ++= Seq(
        Api.Shared
      , BspClientApi.Model
      , BspCommon.Bases
      , BspCommon.Commons
      , BspOtpProvider.ClientJava
      , ClientInfo.Extended
      , ClientInfo.JApi
      , Consolidator.Model
      , Instantor.Api
      , Instantor.Commons
      , PropsLoader.Api
      , PropsLoader.Core
      , _Sandbox.NameCompare
      , _Sandbox.Search
      , TotaLog.Interfaces
      , TotaLog.Search
      , TotaLog.Transport
      , Transport.Common
      )
    )
  )
}
