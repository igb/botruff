rm -rf dist
mkdir dist
javac -cp lib/polyglot-24.1.0.jar  -d dist src/org/hccp/graal/python/*.java
