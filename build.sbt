ThisBuild / scalaVersion := "3.7.4"
ThisBuild / organization := "com.fpclass"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "fp-class",
    // 日付フォルダ内のscalaフォルダからScalaファイルを読み込む
    // src/YYYYMMDD/scala/ の構造に対応
    Compile / scalaSource := baseDirectory.value / "src",
    libraryDependencies ++= Seq(
      // テストフレームワーク（必要に応じて）
      // "org.scalatest" %% "scalatest" % "3.2.19" % Test
    )
  )

