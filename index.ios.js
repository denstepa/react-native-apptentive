/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  NativeModules
} from 'react-native';

var ApptentiveBridge = NativeModules.ApptentiveBridge;


class Aptentive extends Component {


  render() {
    console.log(ApptentiveBridge)
    ApptentiveBridge.engage('test_event_name', () => {
      alert('notified!')
    });
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>
          Welcome to React Native!
          {ApptentiveBridge.greeting}
        </Text>
        <Text style={styles.instructions}>
          To get started, edit index.ios.js
        </Text>
        <Text style={styles.instructions}>
          Press Cmd+R to reload,{'\n'}
          Cmd+D or shake for dev menu
        </Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});

AppRegistry.registerComponent('Aptentive', () => Aptentive);
