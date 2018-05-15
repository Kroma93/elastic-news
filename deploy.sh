set -e
./build_web.sh
cd elastic-news-web
mvn wildfly:deploy-only -Dwildfly.hostname=localhost -Dwildfly.password=q1w2e3r4 -Dwildfly.username=elastic-search -Dwildfly.port=9990
fi
cd ../
`



