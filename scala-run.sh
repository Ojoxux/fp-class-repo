#!/bin/bash

# 日付を指定してScalaコードをコンパイル・実行するスクリプト
# 使用方法: ./scala-run.sh YYYYMMDD [MainObjectName]

if [ -z "$1" ]; then
  echo "使用方法: ./scala-run.sh YYYYMMDD [MainObjectName]"
  echo "例: ./scala-run.sh 20251112 Main"
  exit 1
fi

DATE=$1
MAIN_OBJECT=${2:-Main}

# 指定された日付フォルダが存在するか確認
if [ ! -d "src/$DATE/scala" ]; then
  echo "エラー: src/$DATE/scala が見つかりません"
  exit 1
fi

# コンパイル
echo "コンパイル中: src/$DATE/scala"
sbt -Ddate=$DATE compile

# 実行
if [ $? -eq 0 ]; then
  echo "実行中: $MAIN_OBJECT"
  sbt -Ddate=$DATE "runMain $MAIN_OBJECT"
fi

