# PlantUML导出大图被截取和乱码

## 问题

(1)IDEA中的PlantUML插件导出大图的时候只导出了部分，如果缩小后导出放大将模糊。
(2)使用PlantUML官方提供的jar包导出存在一样的问题同时中文将乱码。

## 原因

(1)PlantUML限制图像的宽度和高度为4096。如果长度超出范围将截取。
(2)中文乱码是由于PlantUML使用平台（系统）的默认字符集（一般是windows-1252）。


## 解决办法

使用PlantUML官方提供的jar导出PNG图像。并且设置对应的参数解决以上的2个问题。

首先下载 PlantUML jar 包
链接：https://github.com/plantuml/plantuml/releases/tag/v1.2022.3
选择 plantuml-1.2022.3.jar 下载，然后将下载好的 jar 包放在自己指定的目录下，只要自己找得到就行。

## 切换到下载的 jar 包目录下，执行一下命令：
java -DPLANTUML_LIMIT_SIZE=131072 -jar plantuml-1.2022.3.jar filename.puml

-DPLANTUML_LIMIT_SIZE参数是设置图像的宽高，需要设置对应的大小即可。如果图像很大会存在内存问题。需要将参数-Xml1024m添加到Java虚拟机

如果导出的图像仍然不清晰，需要在自己 plantum 文件里添加：

```puml
@startuml
skinparam dpi 800
scale 13500 width
scale 2200 height
@enduml
```

dpi 是清晰度


