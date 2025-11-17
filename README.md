# fp-class

関数型プログラミングの学習用リポジトリです。TypeScript と Scala の両方でコードを書けます。

## TypeScript の実行方法

```bash
npx ts-node src/YYYYMMDD/typescript/index.ts
```

## Scala の実行方法

### 日付を指定して実行

```bash
./scala-run.sh 20251112 Main

# OR
sbt -Ddate=20251112 compile
sbt -Ddate=20251112 "runMain Main"
```

### すべてのフォルダをコンパイル

```bash
sbt compile

sbt "runMain Main"
```
