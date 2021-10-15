import setuptools

setuptools.setup(
    name="{{cookiecutter.project}}", 
    author="{{cookiecutter.author}}", 
    version="{{cookiecutter.version}}",
    classifiers=[
        "Programming Language :: Python :: 3",
        "License :: OSI Approved :: MIT License",
        "Operating System :: OS Independent",
    ],
    python_requires='>=3.6',

)