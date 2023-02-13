#!/bin/bash
docker build -t google_search .
docker run -it --name googletestscontainer google_search
docker rm googletestscontainer
docker rmi google_search