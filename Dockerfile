FROM python:3.8
ADD . /flask-with-ci-cd
WORKDIR /flask-with-ci-cd
RUN pip install -r requirements.txt
EXPOSE 5000
CMD ["python", "./app.py"]