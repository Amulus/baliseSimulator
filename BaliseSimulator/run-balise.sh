export CLASSPATH=".:`pwd`/lib/antlr-4.9.1-complete.jar:$CLASSPATH"
antlr4='java org.antlr.v4.Tool'
prj='BaliseSimulator'
pkg='BaliseSimulator'
$antlr4 -visitor -package $pkg.generated $prj.g4
rm src/$pkg/generated/*
mv *.java src/$pkg/generated
rm *.interp *.tokens