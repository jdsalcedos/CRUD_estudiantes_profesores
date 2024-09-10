function readJSONFile(fileName) {
  return new Promise((resolve, reject) => {
    const xhr = new XMLHttpRequest();
    xhr.open('GET', fileName, true);
    xhr.responseType = 'json';

    xhr.onload = function() {
      if (xhr.status === 200) {
        resolve(xhr.response);
      } else {
        reject(xhr.statusText);
      }
    };

    xhr.onerror = function() {
      reject(xhr.statusText);
    };

    xhr.send();
  });
}

function writeJSONFile(fileName, data) {
  return new Promise((resolve, reject) => {
    const xhr = new XMLHttpRequest();
    xhr.open('POST', fileName, true);
    xhr.setRequestHeader('Content-Type', 'application/json');

    xhr.onload = function() {
      if (xhr.status === 200) {
        resolve(xhr.responseText);
      } else {
        reject(xhr.statusText);
      }
    };

    xhr.onerror = function() {
      reject(xhr.statusText);
    };

    xhr.send(JSON.stringify(data));
  });
}

export { readJSONFile, writeJSONFile };