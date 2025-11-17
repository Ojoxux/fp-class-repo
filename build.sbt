ThisBuild / scalaVersion := "3.7.4"
ThisBuild / organization := "com.fpclass"
ThisBuild / version := "0.1.0-SNAPSHOT"

// 日付フォルダを指定するシステムプロパティ（例: -Ddate=20251112）
val dateFolder = sys.props.get("date")

lazy val root = (project in file("."))
  .settings(
    name := "fp-class",
    // 日付フォルダが指定されている場合はそのフォルダのみ、そうでなければすべてのフォルダをコンパイル
    Compile / scalaSource := {
      dateFolder match {
        case Some(date) => baseDirectory.value / "src" / date / "scala"
        case None => baseDirectory.value / "src"
      }
    },
    libraryDependencies ++= Seq(
      // テストフレームワーク（必要に応じて）
      // "org.scalatest" %% "scalatest" % "3.2.19" % Test
    )
  )

