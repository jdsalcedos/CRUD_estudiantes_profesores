function readBinaryFile(fileName) {
    return new Promise((resolve, reject) => {
      var xhr = new XMLHttpRequest();
      xhr.open('GET', fileName, true);
      xhr.responseType = 'arraybuffer';
  
      xhr.onload = function() {
        if (xhr.status === 200) {
          var dataArray = new Uint8Array(xhr.response);
          resolve(dataArray);
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
  
  function writeBinaryFile(fileName, data) {
    return new Promise((resolve, reject) => {
      var xhr = new XMLHttpRequest();
      xhr.open('POST', fileName, true);
      xhr.responseType = 'text';
  
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
  
      var blob = new Blob([data], { type: 'application/octet-stream' });
      xhr.send(blob);
    });
  }
  
  export { readBinaryFile, writeBinaryFile };