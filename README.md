# CourseAL-Proj-Com

## 依赖
``` bash
pip3 install antlr4-python3-runtime
```

## 安装antlr4（for Mac）
``` bash
cd /usr/local/lib
sudo curl -O https://www.antlr.org/download/antlr-4.7.2-complete.jar
export CLASSPATH=".:/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.7.2-complete.jar'
``

## 运行

```shell script
antlr4 -no-listener -visitor -Dlanguage=Python3 C.g4
python cToPython.py
```