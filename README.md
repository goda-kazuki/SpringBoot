参照サイト
https://www.sejuku.net/blog/106479

Spring Bootのデフォルトポートを変更する場合
src/main/resourcesに、application.propertiesというファイルを作成する

ファイルに以下のような内容を記述する
```
server.port=8888
```
