#! /bin/sh

if [ ! -f args4j-2.33.jar ] ; then 
    # https://mvnrepository.com/artifact/args4j/args4j/2.33
    curl -LO https://repo1.maven.org/maven2/args4j/args4j/2.33/args4j-2.33.jar
fi

if [ ! -f annotations-19.0.0.jar ] ; then 
    # https://mvnrepository.com/artifact/org.jetbrains/annotations/19.0.0
    curl -LO https://repo1.maven.org/maven2/org/jetbrains/annotations/19.0.0/annotations-19.0.0.jar
fi

if [ ! -f commons-compress-1.20.jar ]; then
    # https://mvnrepository.com/artifact/org.apache.commons/commons-compress/1.20
    curl -LO https://repo1.maven.org/maven2/org/apache/commons/commons-compress/1.20/commons-compress-1.20.jar
fi


if [ ! -d classes ]; then
    mkdir -p classes
fi

javac -d classes -classpath args4j-2.33.jar:annotations-19.0.0.jar:commons-compress-1.20.jar:classes $(find src -name '*.java')

jar cvfm compressor-0.1.0.jar data/manifest.mf -C classes/ .

# 実行方法は次のコマンドで確認すること．
# java -jar compress-0.1.0.jar --help 
